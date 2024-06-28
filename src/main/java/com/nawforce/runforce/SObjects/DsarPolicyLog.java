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
public class DsarPolicyLog extends SObject {
	public static SObjectType$<DsarPolicyLog> SObjectType;
	public static SObjectFields$<DsarPolicyLog> Fields;

	public Datetime CompletionDatetime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DataSubjectId;
	public Name DataSubject;
	public Datetime DeletedDatetime;
	public String DeveloperName;
	public Datetime DownloadedDatetime;
	public String DsarError;
	public Id DsarPolicyId;
	public DsarPolicy DsarPolicy;
	public String FileUrl;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Datetime RequestDatetime;
	public String RequestStatus;
	public Id RequestUserId;
	public User RequestUser;
	public Datetime SystemModstamp;

	public DsarPolicyLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public DsarPolicyLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public DsarPolicyLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public DsarPolicyLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public DsarPolicyLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
