/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MktSgmntActvtnContactPoint extends SObject {
	public static SObjectType$<MktSgmntActvtnContactPoint> SObjectType;
	public static SObjectFields$<MktSgmntActvtnContactPoint> Fields;

	public String ContactPointFilterExpression;
	public String ContactPointPath;
	public String ContactPointPreference;
	public Integer ContactPointPreferencePriority;
	public String ContactPointType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DataChangeStatus;
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
	public Datetime SystemModstamp;

	public MktSgmtActvContactPtField[] MktSgmtActvContactPtFields;
	public MktSgmtActvContactPtSrc[] MktSgmtActvContactPtSrcs;

	public MktSgmntActvtnContactPoint clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnContactPoint clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnContactPoint clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnContactPoint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmntActvtnContactPoint clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
