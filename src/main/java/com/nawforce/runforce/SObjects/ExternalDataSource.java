/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExternalDataSource extends SObject {
	public static SObjectType$<ExternalDataSource> SObjectType;
	public static SObjectFields$<ExternalDataSource> Fields;

	public Id AuthProviderId;
	public AuthProvider AuthProvider;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomConfiguration;
	public String DeveloperName;
	public String Endpoint;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsWritable;
	public String Language;
	public Id LargeIconId;
	public StaticResource LargeIcon;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Id NamedCredentialId;
	public NamedCredential NamedCredential;
	public String NamespacePrefix;
	public String PrincipalType;
	public String Protocol;
	public String Repository;
	public Id SmallIconId;
	public StaticResource SmallIcon;
	public Datetime SystemModstamp;
	public String Type;

	public CustomHttpHeader[] CustomHttpHeaders;
	public ExternalDataSrcDescriptor[] ExternalDataSrcDescriptors;
	public SetupEntityAccess[] SetupEntityAccessItems;
	public ExternalDataUserAuth[] UserAuths;

	public ExternalDataSource clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSource clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSource clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataSource clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
