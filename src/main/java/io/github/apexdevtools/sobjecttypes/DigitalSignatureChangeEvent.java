/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
