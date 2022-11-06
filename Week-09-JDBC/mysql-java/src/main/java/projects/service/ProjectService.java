/**
 * 
 */
package projects.service;
import projects.dao.ProjectDao;

import projects.entity.Project;

/**
 * @author Nick Sovannalay
 *
 */
public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	

	/**
	 * Default constructor: creates an instance of ProjectService.
	 */
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
		
	}

}
