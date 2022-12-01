package day10_NestedIf_Tasks;

import java.util.Scanner;

public class StatusHttp {

    public static void main(String[] args) {

        /*
        int statusCode=419;

        String output=(statusCode==200)?"OK":(statusCode==201)?"Created":(statusCode==202)?"Accepted"
                :(statusCode==301)?"Moved Permanently":(statusCode==303)?"See Other":(statusCode==304)?"Not Modified"
                :(statusCode==307)?"Temporary Redirect":(statusCode==400)?"Bad Request":(statusCode==401)?"Unauthorized"
                :(statusCode==403)?"Forbidden":(statusCode==404)?"Not Found":(statusCode==410)?"Gone"
                :(statusCode==500)?"Internal Server Error":(statusCode==503)?"Service Unavailable":"Wrong Code";

        System.out.println("Status code = "+statusCode +"\n"+ "Output = "+output);
*/


        Scanner scanner= new Scanner(System.in);
        System.out.println("Give me the code;");
        int code=scanner.nextInt();
        System.out.println((code==200)?"OK":(code==201)?"Created":(code==202)?"Accepted":(code==301)?"Moved Permanently":(code==303)?"See Other":(code==304)?
                "Not Modified":(code==307)?"Temporary Redirect":(code==400)?"Bad Request":(code==404)?"Not Found":(code==410)?"Gone"
                :(code==500)?"Internal Server Error":(code==503)?"Service Unavailable":"invalid");
        scanner.close();


    }

}
/*
7.  HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable

 */
