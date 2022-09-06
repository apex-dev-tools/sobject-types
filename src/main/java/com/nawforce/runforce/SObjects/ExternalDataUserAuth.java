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
public class ExternalDataUserAuth extends SObject {
	public static SObjectType$<ExternalDataUserAuth> SObjectType;
	public static SObjectFields$<ExternalDataUserAuth> Fields;

	public Id AuthProviderId;
	public AuthProvider AuthProvider;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id ExternalDataSourceId;
	public Name ExternalDataSource;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Password;
	public String Protocol;
	public Datetime SystemModstamp;
	public Id UserId;
	public User User;
	public String Username;

	public ExternalDataUserAuth clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataUserAuth clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataUserAuth clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataUserAuth clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExternalDataUserAuth clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
