/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProfileSkillEndorsementChangeEvent extends SObject {
	public static SObjectType$<ProfileSkillEndorsementChangeEvent> SObjectType;
	public static SObjectFields$<ProfileSkillEndorsementChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id ProfileSkillUserId;
	public ProfileSkillUser ProfileSkillUser;
	public String ReplayId;
	public Id UserId;
	public User User;

	public ProfileSkillEndorsementChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProfileSkillEndorsementChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProfileSkillEndorsementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProfileSkillEndorsementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProfileSkillEndorsementChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
