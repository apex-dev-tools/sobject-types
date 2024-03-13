/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DigitalSignatureChangeEvent extends SObject {
	public static SObjectType$<DigitalSignatureChangeEvent> SObjectType;
	public static SObjectFields$<DigitalSignatureChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DigitalSignatureNumber;
	public String Document;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public SObject Parent;
	public String Place;
	public String ReplayId;
	public String SignatureType;
	public String SignedBy;
	public Datetime SignedDate;

	public DigitalSignatureChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignatureChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignatureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignatureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DigitalSignatureChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
