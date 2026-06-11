/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class NetworkEmailTmplAllowlist extends SObject {
	public static SObjectType$<NetworkEmailTmplAllowlist> SObjectType;
	public static SObjectFields$<NetworkEmailTmplAllowlist> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public Datetime SystemModstamp;

	public NetworkEmailTmplAllowlist clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkEmailTmplAllowlist clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkEmailTmplAllowlist clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkEmailTmplAllowlist clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkEmailTmplAllowlist clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
