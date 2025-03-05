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
public class MktSgmtActvContactPtField extends SObject {
	public static SObjectType$<MktSgmtActvContactPtField> SObjectType;
	public static SObjectFields$<MktSgmtActvContactPtField> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id MktSgmntActvtnContactPointId;
	public MktSgmntActvtnContactPoint MktSgmntActvtnContactPoint;
	public String Name;
	public String PreferredName;
	public Datetime SystemModstamp;

	public MktSgmtActvContactPtField clone$() {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvContactPtField clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvContactPtField clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvContactPtField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MktSgmtActvContactPtField clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
