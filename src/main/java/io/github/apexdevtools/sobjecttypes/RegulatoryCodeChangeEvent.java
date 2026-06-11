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
