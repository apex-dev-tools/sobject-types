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
public class InventoryItemReservation extends SObject {
	public static SObjectType$<InventoryItemReservation> SObjectType;
	public static SObjectFields$<InventoryItemReservation> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String ErrorCode;
	public String ErrorMessage;
	public Id Id;
	public String InventoryItemReservationName;
	public Id InventoryReservationId;
	public InventoryReservation InventoryReservation;
	public Boolean IsDeleted;
	public Id ItemReservationSourceId;
	public CartItem ItemReservationSource;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id ProductId;
	public Product2 Product;
	public Decimal Quantity;
	public Id ReservedAtLocationId;
	public Name ReservedAtLocation;
	public String StockKeepingUnit;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public InventoryItemReservation clone$() {throw new java.lang.UnsupportedOperationException();}
	public InventoryItemReservation clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public InventoryItemReservation clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public InventoryItemReservation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public InventoryItemReservation clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
