/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
public void statusDetail(StatusCode code) {
        switch (code) {
            case ZERO:
                System.out.println("User status: " + StatusCode.ZERO.getStatus());
                break;
            case ONE:
                System.out.println("User status: " + StatusCode.ONE.getStatus());
                break;
            case TWO:
                System.out.println("User status: " + StatusCode.TWO.getStatus());
                break;
            case THREE:
                System.out.println("User status: " + StatusCode.THREE.getStatus());
                break;
            default:
                System.out.println("NOT VALID CODE");
                break;
        }
    } 
}
