/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EngagementTopicChangeEvent extends SObject {
	public static SObjectType$<EngagementTopicChangeEvent> SObjectType;
	public static SObjectFields$<EngagementTopicChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EngagementId;
	public SObject Engagement;
	public Id Id;
	public String InteractionSummary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentTopicId;
	public EngagementTopic ParentTopic;
	public String ProcessFailureReason;
	public String ProcessName;
	public String ProcessStatus;
	public String ProcessType;
	public Id RelatedPersonId;
	public SObject RelatedPerson;
	public String ReplayId;
	public Id TopicId;
	public SObject Topic;

	public EngagementTopicChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementTopicChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementTopicChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementTopicChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementTopicChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
