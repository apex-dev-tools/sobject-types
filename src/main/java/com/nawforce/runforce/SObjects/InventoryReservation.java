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
public class InventoryReservation extends SObject {
	public static SObjectType$<InventoryReservation> SObjectType;
	public static SObjectFields$<InventoryReservation> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ErrorCode;
	public String ErrorMessage;
	public Id Id;
	public String InventoryReservationName;
	public Boolean IsAsyncOperationInProgress;
	public Boolean IsDeleted;
	public Boolean IsSuccess;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id OwnerId;
	public Name Owner;
	public Datetime ReservationDate;
	public Integer ReservationDurationInSeconds;
	public String ReservationIdentifier;
	public Id ReservationSourceId;
	public WebCart ReservationSource;
	public Datetime SystemModstamp;

	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public InventoryItemReservation[] InventoryItemReservations;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public InventoryReservationShare[] Shares;

	public InventoryReservation clone$() {throw new java.lang.UnsupportedOperationException();}
	public InventoryReservation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InventoryReservation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InventoryReservation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InventoryReservation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
