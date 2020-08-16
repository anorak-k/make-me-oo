So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.Space`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.


Design Changes Explanation:
- The Distance and Direction Calculator class did not have its own data or behavior, it just acts as a helper class to another class and fails to encapsulate anything at all which is the whole idea behind object-oriented programming. Also, there is a high chance that it can evolve into doing a lot more and grouping more unrelated functions together in the future which is not a good object-oriented design.

- So, since we have to rid of the helper class, now can move those functions to the Point class itself. The problem with doing so is that neither distance nor direction looks like a behaviour of the point entity. A point's behaviour is just to exist, and it is independent of other points. So, it doesn't feel right for the point class to have the methods distance and direction calculator.

- A parent class named Graph is created. Graph is supposed to be a space where a point/ many points exists. So, a graph contains points, and it can know the distance, or the direction between any two points which exist in it. 

- There is no need of getters and setters of point now since we could access them from the parent class.  