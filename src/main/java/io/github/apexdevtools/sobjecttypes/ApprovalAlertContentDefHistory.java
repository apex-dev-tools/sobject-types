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
public class ApprovalAlertContentDefHistory extends SObject {
	public static SObjectType$<ApprovalAlertContentDefHistory> SObjectType;
	public static SObjectFields$<ApprovalAlertContentDefHistory> Fields;

	public Id ApprovalAlertContentDefId;
	public ApprovalAlertContentDef ApprovalAlertContentDef;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;

	public ApprovalAlertContentDefHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApprovalAlertContentDefHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalAlertContentDefHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalAlertContentDefHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApprovalAlertContentDefHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
