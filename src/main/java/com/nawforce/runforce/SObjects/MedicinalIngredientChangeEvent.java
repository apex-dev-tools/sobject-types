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
public class MedicinalIngredientChangeEvent extends SObject {
	public static SObjectType$<MedicinalIngredientChangeEvent> SObjectType;
	public static SObjectFields$<MedicinalIngredientChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id IngredientId;
	public SObject Ingredient;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentRecordId;
	public Medication ParentRecord;
	public String ReplayId;
	public Decimal StrengthDenominator;
	public Id StrengthDenominatorUnitId;
	public UnitOfMeasure StrengthDenominatorUnit;
	public Decimal StrengthNumerator;
	public Id StrengthNumeratorUnitId;
	public UnitOfMeasure StrengthNumeratorUnit;

	public MedicinalIngredientChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicinalIngredientChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicinalIngredientChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicinalIngredientChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicinalIngredientChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
