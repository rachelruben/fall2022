package assignment8;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.NotYetImplementedException;

public class Entity {
	
	private boolean isZombie;
	private double x;
	private double y;
	private double radius = 0.008;
	
	/**
	 * @param isZombie the undead state of this Entity.
	 *                 true if zombie, false otherwise.
	 * @param x        the x-coordinate of this Entity's center.
	 * @param y        the y-coordinate of this Entity's center.
	 */
	public Entity(boolean isZombie, double x, double y) {
		//indicates whether it is a zombie and starting position
			// FIXME
		this.isZombie = isZombie;
		this.x = x;
		this.y = y;
	}

	/**
	 * @return true if zombie, false otherwise
	 */
	public boolean isZombie() {
		
			// FIXME
		return this.isZombie;
			//throw new NotYetImplementedException();
	}

	/**
	 * @return the center x-coordinate
	 */
	public double getX() {
		
			// FIXME
		return this.x;
		//	throw new NotYetImplementedException();
	}

	/**
	 * @return the center y-coordinate
	 */
	public double getY() {
		
			// FIXME
		return this.y;
		//	throw new NotYetImplementedException();
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		
			// FIXME
		return this.radius;
		//	throw new NotYetImplementedException();
	}
	
	private static final Color zombieColor = new Color(0, 153, 0);
	private static final Color nonzombieColor = new Color(51, 204, 255);

	/**
	 * Draw this Entity.
	 */
	public void draw() {
		
			// FIXME
		if(this.isZombie) {
			StdDraw.setPenColor(zombieColor);
		}
		else {
			StdDraw.setPenColor(nonzombieColor);
		}
		StdDraw.filledCircle(this.x, this.y, this.radius);
		//	throw new NotYetImplementedException();
	}

	/**
	 * @param xOther x-coordinate of the other point.
	 * @param yOther y-coordinate of the other point.
	 * @return distance between this Entity's center and the specified other point.
	 */
	public double distanceCenterToPoint(double xOther, double yOther) {
		
			// FIXME
		//distance between two points = sqrt((x2-x1)^2 + (y2-y1)^2)
		return Math.sqrt(Math.pow(this.x - xOther, 2) + Math.pow(this.y - yOther, 2));
		//	throw new NotYetImplementedException();
	}

	/**
	 * @param other the other Entity
	 * @return the distance between this Entity's center and the specified other
	 *         Entity's center.
	 */
	public double distanceCenterToCenter(Entity other) {
		return distanceCenterToPoint(other.getX(), other.getY());
	}

	/**
	 * @param xOther      the x-coordinate of another Entity's center.
	 * @param yOther      the y-coordinate of another Entity's center.
	 * @param radiusOther the radius of another Entity.
	 * @return the distance between this Entity's edge and the specified other
	 *         Entity's edge.
	 */
	public double distanceEdgeToEdge(double xOther, double yOther, double radiusOther) {
		
			// FIXME
		//otherCenter - center + (radius - center) + (otherRadius - otherCenter)
		return distanceCenterToPoint(xOther, yOther) - (this.radius + radiusOther);
		//	throw new NotYetImplementedException();
	}

	/**
	 * @param other the other Entity.
	 * @return the distance between this Entity's edge and the specified other
	 *         Entity's edge.
	 */
	public double distanceEdgeToEdge(Entity other) {
		return distanceEdgeToEdge(other.getX(), other.getY(), other.getRadius());
	}

	/**
	 * @param xOther      the x-coordinate of another Entity's center.
	 * @param yOther      the y-coordinate of another Entity's center.
	 * @param radiusOther the radius of another Entity.
	 * @return true if the bounding circle of this Entity overlaps with the bounding
	 *         circle of the specified other Entity, false otherwise.
	 */
	public boolean isTouching(double xOther, double yOther, double radiusOther) {
		
			// FIXME
		if(distanceEdgeToEdge(xOther, yOther, radiusOther) <= 0) {
			return true;
		}
		else {
			return false;
		}
		//	throw new NotYetImplementedException();	
	}

	/**
	 * @param other the other Entity
	 * @return true if the bounding circle of this Entity overlaps with the bounding
	 *         circle of the specified other Entity, false otherwise.
	 */
	public boolean isTouching(Entity other) {
		return isTouching(other.getX(), other.getY(), other.getRadius());
	}

	/**
	 * @param xOther x-coordinate of the other point.
	 * @param yOther y-coordinate of the other point.
	 * @param amount the amount to move toward the point.
	 */
	public void moveToward(double xOther, double yOther, double amount) {
		double xVector = xOther - getX();
		double yVector = yOther - getY();
		double angle = Math.atan2(yVector, xVector);
		double xAmount = amount * Math.cos(angle);
		double yAmount = amount * Math.sin(angle);
	//	throw new RuntimeException(
		//	"\n\nIf necessary, watch this video on how to fix this method:\n\n\thttps://www.youtube.com/watch?v=5mkiddBiTxM\n\nRemove this RuntimeException and uncomment the lines below.\nIf you named your x and y coordinate instance variables something other than x and y, update the lines to use those instance variables.");
		this.x += xAmount;
		this.y += yAmount;
	}

	/**
	 * @param other  the other Entity
	 * @param amount the amount to move toward the other Entity.
	 */
	public void moveToward(Entity other, double amount) {
		if(other != null) {
			moveToward(other.getX(), other.getY(), amount);
		}
	}

	/**
	 * @param xOther x-coordinate of the other point.
	 * @param yOther y-coordinate of the other point.
	 * @param amount the amount to move away from the point.
	 */
	public void moveAwayFrom(double xOther, double yOther, double amount) {
		
			// FIXME
		//should be opposite of moving toward
		moveToward(xOther, yOther, (-1) * amount);
		//	throw new NotYetImplementedException();
	}

	/**
	 * @param other  the other Entity
	 * @param amount the amount to move away from the other Entity.
	 */
	public void moveAwayFrom(Entity other, double amount) {
		moveAwayFrom(other.getX(), other.getY(), amount);
	}

	/**
	 * @param entities          this list of entities to search.
	 * @param includeZombies    whether to include zombies in this search or not.
	 * @param includeNonzombies whether to include nonzombies in this search or not.
	 * @return the closest Entity to this Entity in entities (which is not this).
	 */
	private Entity findClosest(List<Entity> entities, boolean includeZombies, boolean includeNonzombies) {
		Entity closest = null;
		double closestDist = Double.MAX_VALUE;
		for (Entity other : entities) {
			// NOTE:
			// We almost always want to use the equals method when comparing Objects.
			// In this case, we check if the two entities are the exact same instance.
			if (this != other) {
				if ((other.isZombie() && includeZombies) || (!other.isZombie() && includeNonzombies)) {
					double dist = distanceEdgeToEdge(other);
					if (dist < closestDist) {
						closest = other;
						closestDist = dist;
					}
				}
			}
		}
		return closest;
	}

	/**
	 * @param entities this list of entities to search.
	 * @return the closest nonzombie to this Entity in entities (which is not this).
	 */
	public Entity findClosestNonzombie(List<Entity> entities) {
		return findClosest(entities, false, true);
	}

	/**
	 * @param entities this list of entities to search.
	 * @return the closest zombie to this Entity in entities (which is not this).
	 */
	public Entity findClosestZombie(List<Entity> entities) {
		return findClosest(entities, true, false);
	}

	/**
	 * @param entities this list of entities to search.
	 * @return the closest Entity to this Entity in entities (which is not this).
	 */
	public Entity findClosestEntity(List<Entity> entities) {
		return findClosest(entities, true, true);
	}

	private static double speed = 0.08;
	private static double radiusLimit = 0.02;
	/**
	 * Updates the appropriate state (instance variables) of this Entity for the
	 * current frame of the simulation.
	 * 
	 * @param entities  list of remaining entities in the simulation. It is likely
	 *                  that this Entity will be one of the entities in the list.
	 *                  Care should be taken to not overreact to oneself.
	 * @param deltaTime the change in time since the previous frame
	 * 
	 * @return true if this Entity remains in existence past the current frame,
	 *         false if consumed
	 */
	public boolean update(List<Entity> entities, double deltaTime) {
		
			// FIXME
		/**
		 * return true if this Entity should remain active for next round , false if consumed
		 * when non touches zombie , random chance that it will be consumed
		 * 80% of the time should change to zombie at same spot with same size
		 * 20% of the time should increase zombie radius by 20% of nonzombie's radius
		 * maximum size of 0.02
		 * should be instances where zombies intentionally move toward nonzombies
		 * should be instances where nonzombies intentionally move away from zombies
		*/
		if(this.isZombie()) { //if zombie , move toward nearest nonzombie
			Entity nonZombie = this.findClosestNonzombie(entities);
			if(nonZombie != null) {
				this.moveToward(nonZombie, deltaTime * speed);
			}
		}
		else { //if nonzombie , find the nearest zombie (to move away from it)
			Entity zombie = this.findClosestZombie(entities);
			if(!this.isTouching(zombie)) { //if nonzombie is NOT touching nearest zombie , move away
				if(Math.random() <= 0.2) {
					this.moveAwayFrom(zombie, deltaTime * speed);
				}
				else {
					Entity nearestEntity = this.findClosestEntity(entities);
					this.moveAwayFrom(nearestEntity, deltaTime * speed);
				}
			}
			else { //if nonzombie IS touching nearest zombie 
				this.isZombie = true; //becomes zombie
				if(Math.random() <= 0.2) { //max radius is 20% 
					if(zombie.getRadius() * 1.2 >= radiusLimit) { //increase size by 20% 
						zombie.radius = radiusLimit; //if radius is 0.02 or more , set radius to 0.02
					}
					else {
						zombie.radius = zombie.getRadius() * 1.2;
					}
					return false;
				}
			}
		} //stays in the visible window 
		if(this.x > 1) {
			this.x = 0.99;
		}
		else if(this.x < 0) {
			this.x = 0.01;
		}
		else if(this.y > 1) {
			this.y = 0.99;
		}
		else if(this.y < 0) {
			this.y = 0.01;
		}
			return true;
			//throw new NotYetImplementedException();
	}
}