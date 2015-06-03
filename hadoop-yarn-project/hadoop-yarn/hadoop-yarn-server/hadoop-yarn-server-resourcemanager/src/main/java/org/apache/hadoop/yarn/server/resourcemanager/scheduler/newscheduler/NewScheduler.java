package org.apache.hadoop.yarn.server.resourcemanager.scheduler.newscheduler;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.yarn.api.records.ApplicationAttemptId;
import org.apache.hadoop.yarn.api.records.ContainerId;
import org.apache.hadoop.yarn.api.records.ContainerStatus;
import org.apache.hadoop.yarn.api.records.QueueACL;
import org.apache.hadoop.yarn.api.records.QueueInfo;
import org.apache.hadoop.yarn.api.records.QueueUserACLInfo;
import org.apache.hadoop.yarn.api.records.ResourceRequest;
import org.apache.hadoop.yarn.server.resourcemanager.RMContext;
import org.apache.hadoop.yarn.server.resourcemanager.recovery.RMStateStore.RMState;
import org.apache.hadoop.yarn.server.resourcemanager.rmcontainer.RMContainer;
import org.apache.hadoop.yarn.server.resourcemanager.rmcontainer.RMContainerEventType;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.AbstractYarnScheduler;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.Allocation;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.QueueMetrics;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.common.fica.FiCaSchedulerApp;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.common.fica.FiCaSchedulerNode;
import org.apache.hadoop.yarn.server.resourcemanager.scheduler.event.SchedulerEvent;
import org.apache.hadoop.yarn.util.resource.ResourceCalculator;

public class NewScheduler extends
	AbstractYarnScheduler<FiCaSchedulerApp, FiCaSchedulerNode> implements
	Configurable {

	public NewScheduler(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRMContext(RMContext rmContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reinitialize(Configuration conf, RMContext rmContext)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public QueueInfo getQueueInfo(String queueName, boolean includeChildQueues,
			boolean recursive) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<QueueUserACLInfo> getQueueUserAclInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceCalculator getResourceCalculator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumClusterNodes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Allocation allocate(ApplicationAttemptId appAttemptId,
			List<ResourceRequest> ask, List<ContainerId> release,
			List<String> blacklistAdditions, List<String> blacklistRemovals) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueueMetrics getRootQueueMetrics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkAccess(UserGroupInformation callerUGI, QueueACL acl,
			String queueName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ApplicationAttemptId> getAppsInQueue(String queueName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void handle(SchedulerEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recover(RMState state) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConf(Configuration conf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Configuration getConf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void completedContainer(RMContainer rmContainer,
			ContainerStatus containerStatus, RMContainerEventType event) {
		// TODO Auto-generated method stub
		
	}
		
}
