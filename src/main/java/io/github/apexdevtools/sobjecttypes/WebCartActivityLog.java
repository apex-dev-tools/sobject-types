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
public class WebCartActivityLog extends SObject {
	public static SObjectType$<WebCartActivityLog> SObjectType;
	public static SObjectFields$<WebCartActivityLog> Fields;

	public Id CartItemId;
	public CartItem CartItem;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id InitiatedById;
	public User InitiatedBy;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OperationSummary;
	public String OperationType;
	public Id ProductId;
	public Product2 Product;
	public Id SourceCartId;
	public WebCart SourceCart;
	public String Status;
	public Datetime SystemModstamp;
	public Id WebCartId;
	public WebCart WebCart;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public WebCartActivityLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WebCartActivityLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
