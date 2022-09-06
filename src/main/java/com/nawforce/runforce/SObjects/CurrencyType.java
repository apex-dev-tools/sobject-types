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
public class CurrencyType extends SObject {
	public static SObjectType$<CurrencyType> SObjectType;
	public static SObjectFields$<CurrencyType> Fields;

	public Decimal ConversionRate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DecimalPlaces;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCorporate;
	public String IsoCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;

	public CurrencyType clone$() {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CurrencyType clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
