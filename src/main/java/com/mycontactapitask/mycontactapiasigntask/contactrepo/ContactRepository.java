package com.mycontactapitask.mycontactapiasigntask.contactrepo;

import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contacts,Long> {

}
