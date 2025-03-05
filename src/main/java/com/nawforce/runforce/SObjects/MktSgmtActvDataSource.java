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
public class MktSgmtActvDataSource extends SObject {
	public static SObjectType$<MktSgmtActvDataSource> SObjectType;
	public static SObjectFields$<MktSgmtActvDataSource> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MarketSegmentActivationId;
	public MarketSegmentActivation MarketSegmentActivation;
	public String Name;
	public Datetime SystemModstamp;

	public MktSgmtActvDataSource clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataSource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataSource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvDataSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
