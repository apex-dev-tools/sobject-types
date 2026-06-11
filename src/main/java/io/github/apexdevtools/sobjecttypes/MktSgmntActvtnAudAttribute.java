/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MktSgmntActvtnAudAttribute extends SObject {
	public static SObjectType$<MktSgmntActvtnAudAttribute> SObjectType;
	public static SObjectFields$<MktSgmntActvtnAudAttribute> Fields;

	public String AttributeSource;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataChangeStatus;
	public String FilterCriteria;
	public Id Id;
	public Boolean IsDeleted;
	public Datetime LastDataChangeStatusDateTime;
	public String LastDataChangeStatusErrorCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MarketSegmentActivationId;
	public MarketSegmentActivation MarketSegmentActivation;
	public String Name;
	public String PreferredName;
	public String QueryPath;
	public Datetime SystemModstamp;
	public String Type;

	public MktSgmntActvtnAudAttribute clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnAudAttribute clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnAudAttribute clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnAudAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnAudAttribute clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
