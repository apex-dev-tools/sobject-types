/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class DatedConversionRate extends SObject {
	public static SObjectType$<DatedConversionRate> SObjectType;
	public static SObjectFields$<DatedConversionRate> Fields;

	public Decimal ConversionRate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public String IsoCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Date NextStartDate;
	public Date StartDate;
	public Datetime SystemModstamp;

	public DatedConversionRate clone$() {throw new java.lang.UnsupportedOperationException();}
	public DatedConversionRate clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DatedConversionRate clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DatedConversionRate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DatedConversionRate clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
