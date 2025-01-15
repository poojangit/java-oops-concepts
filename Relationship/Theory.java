//Todo ------------Relationships in java------------------------

//^ Inheritence 
//! also called as a IS-A relationship.

//^ Association 
//! It is a relationship between the two classes.
//! The relationship can be of - one-to-one, one-to-many, many-to-one, many-to-many.
//! It is a "Has-A" relationship
//& Association can be further classified into -
//! Aggregation
//! composition

//^ Aggregation 
//! Aggregation is a relationship between the two classes. where both the objects exists independently
//! It is also called as HAS-A relationship.
//! Where the two classess not completely dependent on each other.
//! It is having a loose couple.
//! Example - Driver and a car
//!         Where the driver is not completely dependent on the car
//!         even if the driver is not having the car he will never forget his driving capabilities.
//~ public class Driver {
//~ private Car car;
//~}
//! Example - Football players and a team
//!          - the team will have football players and football players will have the team.
//!          - but the team and football players are complety dependent 
//!          - even if the player does not have a team  or a single player does not have a team it doesn't matter.
//~ public class Team {
//~ List<Players> players;
//~}

//^ Composition
//! Composition is a relationship between the two classes where both the objects cannot exists independently.
//! One object cannot exists without the owner object.
//! It is also called as a "Part-of" relationship.
//! It is having the tight coupling/ strongly coupled
//! Example - Car and engine
//!            Where the car is completly dependent on the engine and engine works only inside the car.
//!             whithout the engine car does not work.
//~ public class Car {
//~ private Engine engine;
//~ }