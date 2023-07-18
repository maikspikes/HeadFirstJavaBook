package OOPExercises.musicMachine.gui.v3;


//All the imports
import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.sound.midi.ShortMessage.*;


public class MiniMusicPlayer {

        // the variables. Random is a variable here
        private MyDrawPanel panel;
        private Random random = new Random();


        // this is the main were the code is executed
        // the miniMusicPlayer is instantiated and called "Mini".
        // Mini calls the Go method.
        public static void main(String[] args) {
                MiniMusicPlayer mini = new MiniMusicPlayer();
                mini.go();
        }

        // Method is called by Go().
        // It sets up the GUI...
        public void setUpGui() {
                JFrame frame = new JFrame("My First Music Video");
                panel = new MyDrawPanel();
                frame.setContentPane(panel);
                frame.setBounds(30, 30, 300, 300);
                frame.setVisible(true);
        }

        // go is called by main, but calls the setUpGui straight away.
        public void go() {
                setUpGui();
                try {
                        // try's to set up the sequencer to make sounds.
                        // sequencer is part of the midiSystem library
                        Sequencer sequencer = MidiSystem.getSequencer();
                        sequencer.open();
                        sequencer.addControllerEventListener(panel, new int[]{127});
                        Sequence seq = new Sequence(Sequence.PPQ, 4);
                        Track track = seq.createTrack();
                        int note;

                        // for loop generates a random note, and adds it to the track made above.
                        for (int i = 0; i < 60; i += 4) {
                                note = random.nextInt(50) + 1;
                                // it invokes the makeEvent method of the MidiEvent class.
                                track.add(makeEvent(NOTE_ON, 1, note, 100, i));
                                track.add(makeEvent(CONTROL_CHANGE, 1, 127, 0, i));
                                track.add(makeEvent(NOTE_OFF, 1, note, 100, i + 2));
                        }
                        sequencer.setSequence(seq);
                        sequencer.start();
                        sequencer.setTempoInBPM(120);
                        // if something fails, it catches the error and prints it to the logs.
                } catch (Exception ex) {
                        ex.printStackTrace();
                }
        }

        public static MidiEvent makeEvent(int cmd, int chnl, int one, int two, int tick) throws InvalidMidiDataException {
                //invokes short message in MyDrawPanel class
                ShortMessage msg = new ShortMessage(cmd, chnl, one, two);
                return new MidiEvent(msg, tick);
        }
        class MyDrawPanel extends JPanel implements ControllerEventListener {
                private boolean msg = false;
                public void controlChange(ShortMessage event) {
                        msg = true;
                        // if there is a message, it wil repaint.
                        repaint();
                }

                public void paintComponent(Graphics graphics) {
                        if (msg) {
                                Color color = generateRandomColor();
                                int height = random.nextInt(120) + 10;
                                int width = random.nextInt(120) + 10;
                                int xPos = random.nextInt(40) + 10;
                                int yPos = random.nextInt(40) + 10;

                                graphics.setColor(color);
                                graphics.fillRect(xPos, yPos, width, height);

                                msg = false;
                        }
                }

                private Color generateRandomColor() {
                        int r = random.nextInt(250);
                        int g = random.nextInt(250);
                        int b = random.nextInt(250);

                        return new Color(r, g, b);
                }
        }
}