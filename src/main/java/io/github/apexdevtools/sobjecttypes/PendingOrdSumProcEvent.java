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
public class PendingOrdSumProcEvent extends SObject {
	public static SObjectType$<PendingOrdSumProcEvent> SObjectType;
	public static SObjectFields$<PendingOrdSumProcEvent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorMessage;
	public String EventUuid;
	public String ExternalReferenceIdentifier;
	public Boolean IsSuccess;
	public Id OrderId;
	public Order Order;
	public String ReplayId;

	public PendingOrdSumProcEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PendingOrdSumProcEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrdSumProcEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrdSumProcEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PendingOrdSumProcEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
