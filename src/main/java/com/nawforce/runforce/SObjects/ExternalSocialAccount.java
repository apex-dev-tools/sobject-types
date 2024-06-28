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
public class ExternalSocialAccount extends SObject {
	public static SObjectType$<ExternalSocialAccount> SObjectType;
	public static SObjectFields$<ExternalSocialAccount> Fields;

	public String AuthorizedBy;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataSourceId;
	public Id DefaultResponseAccountId;
	public ExternalSocialAccount DefaultResponseAccount;
	public String DeveloperName;
	public String ExternalAccountId;
	public String ExternalPictureURL;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsAuthenticated;
	public Boolean IsCaseCreationEnabled;
	public Boolean IsDataSourceActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String ProfileUrl;
	public String Provider;
	public String ProviderUserId;
	public String RuleId;
	public String SocialPropertyId;
	public Datetime SystemModstamp;
	public String TopicId;
	public String UniqueName;
	public String Username;

	public SetupEntityAccess[] SetupEntityAccessItems;

	public ExternalSocialAccount clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalSocialAccount clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalSocialAccount clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalSocialAccount clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalSocialAccount clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
