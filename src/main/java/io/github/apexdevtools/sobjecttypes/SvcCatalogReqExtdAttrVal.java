/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SvcCatalogReqExtdAttrVal extends SObject {
	public static SObjectType$<SvcCatalogReqExtdAttrVal> SObjectType;
	public static SObjectFields$<SvcCatalogReqExtdAttrVal> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Decimal CurrencyValue;
	public Datetime DateTimeValue;
	public Date DateValue;
	public Integer GroupNumber;
	public Id Id;
	public Integer IntegerValue;
	public Boolean IsDeleted;
	public Boolean IsTrueOrFalseValue;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Decimal NumberValue;
	public Decimal PercentageValue;
	public Id ReferenceRecordId;
	public Name ReferenceRecord;
	public Id SvcCatalogItemAttributeId;
	public SvcCatalogItemAttribute SvcCatalogItemAttribute;
	public Id SvcCatalogRequestId;
	public SvcCatalogRequest SvcCatalogRequest;
	public String SvcCtlgItemAttrDataType;
	public String SvcCtlgItemAttrDeveloperName;
	public String SvcCtlgItemAttrLabel;
	public String SvcCtlgItemAttrParent;
	public Datetime SystemModstamp;
	public String TextValue;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;

	public SvcCatalogReqExtdAttrVal clone$() {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogReqExtdAttrVal clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogReqExtdAttrVal clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogReqExtdAttrVal clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SvcCatalogReqExtdAttrVal clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
