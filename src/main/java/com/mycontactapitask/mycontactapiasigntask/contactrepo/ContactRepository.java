package com.mycontactapitask.mycontactapiasigntask.contactrepo;

import com.mycontactapitask.mycontactapiasigntask.model.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contacts,Integer> {

}
