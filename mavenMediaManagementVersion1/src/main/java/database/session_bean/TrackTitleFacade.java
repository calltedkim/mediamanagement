
package database.session_bean;

import database.entity.TrackTitle;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TrackTitleFacade extends AbstractFacade<TrackTitle> {

    @PersistenceContext(unitName = "com.mycompany_mavenMediaManagementVersion1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrackTitleFacade() {
        super(TrackTitle.class);
    }

}
