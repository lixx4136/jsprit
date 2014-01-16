/*******************************************************************************
 * Copyright (C) 2013  Stefan Schroeder
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either 
 * version 3.0 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public 
 * License along with this library.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package jsprit.core.problem.job;

/**
 * Basic interface for all jobs.
 * 
 * @author schroeder
 *
 */
public interface Job {

	/**
	 * Returns the unique identifier (id) of a job.
	 * 
	 * @return id
	 */
	public String getId();

	/**
	 * Returns capacity (demand) of job.
	 * 
	 * <p>It determines how much capacity this job consumes of vehicle/transport unit.
	 * 
	 * @return
	 */
	public int getCapacityDemand();
	
	
}
