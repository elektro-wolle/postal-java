package ca.mgamble.postal.api.message;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mgamble
 */
/*
The MIT License (MIT)

Copyright (c) 2017 Matthew M. Gamble https://www.mgamble.ca

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

@Data
@NoArgsConstructor
public class PostalRawMessage {
    private String mail_from;
    private List<String> rcpt_to;
    private String data;
    private boolean bounce;

    public PostalRawMessage(String from, String data, boolean bounce, List<String> rcpt_to) {
        this.mail_from = from;
        this.data = data;
        this.bounce = bounce;
        this.rcpt_to = rcpt_to;
    }

    public void addTo(String rcptTo) {
        if (this.rcpt_to == null) {
            this.rcpt_to = new ArrayList<>();
        }
        this.rcpt_to.add(rcptTo);
    }
}
