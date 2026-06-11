/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
