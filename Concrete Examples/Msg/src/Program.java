/**
 * Created by buster on 3/7/16.
 */
public class Program {
    public static void main(String args[]) throws Exception {
        String msg = "" +
                "<Msg_XML>"
                        + "<NA>" + "NAString" + "</NA>\n"
                        + "<NB>" + "NBString" + "</NB>\n"
                        + "<A>"  + "AString"  + "</A>\n"
                + "</Msg_XML>";
        Msg_XML msgXML1 = new Msg_XML(msg);
        System.out.println(msgXML1.getNA());
        System.out.println(msgXML1.getNB());
        System.out.println(msgXML1.getA());
    }
}
