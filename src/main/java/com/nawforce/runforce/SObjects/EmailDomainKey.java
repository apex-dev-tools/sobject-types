/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailDomainKey extends SObject {
	public static SObjectType$<EmailDomainKey> SObjectType;
	public static SObjectFields$<EmailDomainKey> Fields;

	public String AlternatePublicKey;
	public String AlternateSelector;
	public String AlternateTxtRecordName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Domain;
	public String DomainMatch;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Integer KeySize;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PublicKey;
	public String Selector;
	public Datetime SystemModstamp;
	public String TxtRecordName;
	public String TxtRecordsPublishState;

	public EmailDomainKey clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
