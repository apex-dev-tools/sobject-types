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
public class ExtlClntAppOauthIpRange extends SObject {
	public static SObjectType$<ExtlClntAppOauthIpRange> SObjectType;
	public static SObjectFields$<ExtlClntAppOauthIpRange> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String EndIpAddress;
	public Id ExtlClntAppOauthSettingsId;
	public ExtlClntAppOauthSettings ExtlClntAppOauthSettings;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String StartIpAddress;
	public Datetime SystemModstamp;

	public ExtlClntAppOauthIpRange clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthIpRange clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthIpRange clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthIpRange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExtlClntAppOauthIpRange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
