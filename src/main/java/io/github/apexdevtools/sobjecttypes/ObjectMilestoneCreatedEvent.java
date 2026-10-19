/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ObjectMilestoneCreatedEvent extends SObject {
	public static SObjectType$<ObjectMilestoneCreatedEvent> SObjectType;
	public static SObjectFields$<ObjectMilestoneCreatedEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Id MilestoneParentId;
	public IndividualApplication MilestoneParent;
	public ObjectMilestoneCreatedDtlEvent[] ObjectMilestoneDetails;
	public String ReplayId;
	public Id SlaProcessId;
	public SlaProcess SlaProcess;

	public ObjectMilestoneCreatedEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ObjectMilestoneCreatedEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ObjectMilestoneCreatedEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ObjectMilestoneCreatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ObjectMilestoneCreatedEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
