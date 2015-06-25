package org.apache.hadoop.yarn.server.resourcemanager.scheduler.edftd;

import java.util.Comparator;

import org.apache.hadoop.yarn.api.records.ApplicationSubmissionContext;

public class EDFApplicationComp implements Comparator<ApplicationSubmissionContext>{

	@Override
	public int compare(ApplicationSubmissionContext o1,
			ApplicationSubmissionContext o2) {
			if (o1.getDeadline() < o2.getDeadline()) {
				return 1;
			} else {
				return -1;
			}
	}

}
