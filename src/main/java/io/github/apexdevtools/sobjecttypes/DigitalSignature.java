/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class DigitalSignature extends SObject {
	public static SObjectType$<DigitalSignature> SObjectType;
	public static SObjectFields$<DigitalSignature> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DeviceOs;
	public String DeviceType;
	public String DigitalSignatureNumber;
	public Blob DocumentBody;
	public String DocumentContentType;
	public Integer DocumentLength;
	public String DocumentName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public Name Parent;
	public String Place;
	public String SignatureType;
	public String SignedBy;
	public Datetime SignedDate;
	public Datetime SystemModstamp;
	public String WebBrowser;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public SignatureTaskLineItem[] SignatureTaskLineItemValue;

	public DigitalSignature clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignature clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignature clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignature clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignature clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
