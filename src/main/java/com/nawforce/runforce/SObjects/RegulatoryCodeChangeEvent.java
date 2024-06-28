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
public class RegulatoryCodeChangeEvent extends SObject {
	public static SObjectType$<RegulatoryCodeChangeEvent> SObjectType;
	public static SObjectFields$<RegulatoryCodeChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public String ExternalUrl;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ParentCodeId;
	public RegulatoryCode ParentCode;
	public Id RegulatoryAuthorityId;
	public RegulatoryAuthority RegulatoryAuthority;
	public String ReplayId;
	public String Subject;
	public String Type;

	public RegulatoryCodeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public RegulatoryCodeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
