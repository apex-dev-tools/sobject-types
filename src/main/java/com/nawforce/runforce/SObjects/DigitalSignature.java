/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DigitalSignature extends SObject {
	public static SObjectType$<DigitalSignature> SObjectType;
	public static SObjectFields$<DigitalSignature> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
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
