package org.powellmakerspace.signonserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.MemberControllerApi;
import io.swagger.client.model.Member;

public class jsonTest extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_test);

        listView = (ListView) findViewById(R.id.listView);

        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("http://10.0.1.94:8080");

        MemberControllerApi client = new MemberControllerApi(apiClient);

        try {
            client.getMembersUsingGETAsync(null, null,
                    new ApiCallback<List<Member>>() {
                        @Override
                        public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {

                        }

                        @Override
                        public void onSuccess(List<Member> result, int statusCode, Map<String, List<String>> responseHeaders) {
                            jsonAdapter JsonAdapter = new jsonAdapter(jsonTest.this, result);
                            listView.setAdapter(JsonAdapter);
                        }

                        @Override
                        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {

                        }

                        @Override
                        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {

                        }
                    }
            );
        } catch (ApiException e) {
            e.printStackTrace();
        }

    }
}
