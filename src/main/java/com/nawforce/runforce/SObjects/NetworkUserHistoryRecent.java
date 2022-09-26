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
public class NetworkUserHistoryRecent extends SObject {
	public static SObjectType$<NetworkUserHistoryRecent> SObjectType;
	public static SObjectFields$<NetworkUserHistoryRecent> Fields;

	public Datetime AccessTimestamp;
	public String ActionType;
	public String CombinedIdField;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DomainName;
	public Id FeedCommentId;
	public FeedComment FeedComment;
	public Id FeedItemId;
	public FeedItem FeedItem;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public Id NetworkUserId;
	public User NetworkUser;
	public Id RecordId;
	public SObject Record;
	public String RecordKeyPrefix;
	public Datetime SystemModstamp;
	public String Url;
	public String UserType;

	public NetworkUserHistoryRecent clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkUserHistoryRecent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkUserHistoryRecent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkUserHistoryRecent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkUserHistoryRecent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
