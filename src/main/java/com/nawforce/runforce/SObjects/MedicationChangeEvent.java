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
public class MedicationChangeEvent extends SObject {
	public static SObjectType$<MedicationChangeEvent> SObjectType;
	public static SObjectFields$<MedicationChangeEvent> Fields;

	public Integer BatchNumber;
	public String BrandNameAlternative;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime ExpirationDateTime;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ManufacturerId;
	public Account Manufacturer;
	public String MedicationCategory;
	public Id MedicationCodeId;
	public CodeSetBundle MedicationCode;
	public Id MedicationFormId;
	public CodeSetBundle MedicationForm;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ProductId;
	public Product2 Product;
	public Decimal QuantityDenominator;
	public Decimal QuantityNumerator;
	public Id QuantityUnitId;
	public UnitOfMeasure QuantityUnit;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;
	public String Status;

	public MedicationChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
