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
