/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class OrgWideEmailAddress extends SObject {
	public static SObjectType$<OrgWideEmailAddress> SObjectType;
	public static SObjectFields$<OrgWideEmailAddress> Fields;

	public String Address;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DisplayName;
	public Id Id;
	public Boolean IsAllowAllProfiles;
	public Boolean IsVerified;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Purpose;
	public Datetime SystemModstamp;

	public OrgEmailAddressSecurity[] OrgEmailAddressSecurityItems;
	public SetupEntityAccess[] SetupEntityAccessItems;

	public OrgWideEmailAddress clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgWideEmailAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
