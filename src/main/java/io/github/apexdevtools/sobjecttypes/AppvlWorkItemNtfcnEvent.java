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
public class AppvlWorkItemNtfcnEvent extends SObject {
	public static SObjectType$<AppvlWorkItemNtfcnEvent> SObjectType;
	public static SObjectFields$<AppvlWorkItemNtfcnEvent> Fields;

	public String ApprovalFlowApiName;
	public String ApprovalStepApiName;
	public Id ApprovalWorkItemId;
	public ApprovalWorkItem ApprovalWorkItem;
	public String ApprovalWorkItemName;
	public String CorrelationIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EventUuid;
	public Id NotificationAssigneeId;
	public Name NotificationAssignee;
	public String NotificationBody;
	public String NotificationChannel;
	public String NotificationReason;
	public String NotificationSubject;
	public String RelatedRecordIdentifier;
	public String ReplayId;
	public String RequestIdentifier;

	public AppvlWorkItemNtfcnEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppvlWorkItemNtfcnEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppvlWorkItemNtfcnEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppvlWorkItemNtfcnEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppvlWorkItemNtfcnEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
