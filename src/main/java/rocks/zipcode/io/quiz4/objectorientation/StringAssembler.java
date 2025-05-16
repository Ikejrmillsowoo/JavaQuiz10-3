package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private char delimeter;
    StringBuilder sb;
    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        this.sb = new StringBuilder();
    }

    public StringAssembler append(String str) {
        if (sb.length() == 0){
            sb.append(str);
        } else {
            sb.append(delimeter).append(str);
        }

        return this;
    }

    public String assemble() {
      return sb.toString().trim();
    }
}
