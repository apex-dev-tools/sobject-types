/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AgeBandHlthRskAdjFctrChangeEvent extends SObject {
	public static SObjectType$<AgeBandHlthRskAdjFctrChangeEvent> SObjectType;
	public static SObjectFields$<AgeBandHlthRskAdjFctrChangeEvent> Fields;

	public Decimal AgeBandEnd;
	public Decimal AgeBandStart;
	public Object ChangeEventHeader;
	public Decimal CmnyFullBnftDualDisabled;
	public Decimal CmnyPartialBenefitDualAged;
	public Decimal CmnyPartialBnftDualDsbl;
	public Decimal Community;
	public Decimal CommunityFullBnftDualAged;
	public Decimal CommunityNonDualAged;
	public Decimal CommunityNonDualDisabled;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EnrolleeType;
	public String Gender;
	public Id Id;
	public Decimal Institutional;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Integer PublishedYear;
	public String ReplayId;

	public AgeBandHlthRskAdjFctrChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctrChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AgeBandHlthRskAdjFctrChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
