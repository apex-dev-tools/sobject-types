/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ChatRetirementRdyMetrics extends SObject {
	public static SObjectType$<ChatRetirementRdyMetrics> SObjectType;
	public static SObjectFields$<ChatRetirementRdyMetrics> Fields;

	public Integer ActiveChatButtons;
	public Integer ActiveChatDeployments;
	public Integer ActiveChatInvitations;
	public Integer ActiveQbrButtons;
	public Integer ActiveSbrButtons;
	public Integer ActiveVfDeployments;
	public String ChatApexClassList;
	public Integer ChatApexClasses;
	public Integer ChatBots;
	public Integer ChatFlowCount;
	public String ChatFlowList;
	public String ChatObjectsInApexList;
	public String ChatObjectsInFlowList;
	public Integer CustomLabels;
	public Integer CustomWebComponents;
	public Integer EmbeddedServiceDeployments;
	public Id Id;
	public Integer IpBlockingRules;
	public Date MetricsDate;
	public String PrimaryChatReportList;
	public String PrimaryChatReportTypeList;
	public Integer PrimaryChatReportTypes;
	public Integer Queues;
	public String SecondaryChatReportList;
	public String SecondaryChatReportTypeList;
	public Integer SecondaryChatReportTypes;
	public Integer SkillBasedRoutingRules;
	public Integer Skills;
	public Datetime SystemModstamp;
	public String UniqueChatObjectsInReport;

	public ChatRetirementRdyMetrics clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChatRetirementRdyMetrics clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChatRetirementRdyMetrics clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChatRetirementRdyMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChatRetirementRdyMetrics clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
