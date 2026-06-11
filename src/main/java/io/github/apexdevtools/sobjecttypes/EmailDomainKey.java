/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
	public String DomainMatchPattern;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsDnsDelegated;
	public Boolean IsMceShared;
	public Integer KeySize;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PlatformType;
	public String PublicKey;
	public String Selector;
	public String Status;
	public String StatusMessage;
	public Datetime SystemModstamp;
	public String ThirdSelector;
	public String ThirdTxtRecordName;
	public String TxtRecordName;
	public String TxtRecordsPublishState;

	public SenderEmailAddress[] SenderEmailAddresses;

	public EmailDomainKey clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailDomainKey clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
